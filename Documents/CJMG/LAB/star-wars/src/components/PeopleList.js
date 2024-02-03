import { useEffect, useState } from "react";
import People from './People';

export function PeopleList() {
  const [peoples, setPeoples] = useState([]);

  useEffect(() => {
    async function dataFetch() {
      const response = await fetch("https://swapi.dev/api/people/");
      const data = await response.json();
      setPeoples(data.results);
    }

    dataFetch();
  }, []);

  return (
    <div>
      {peoples.map((people) => {
        return (
          <People key={people.name} people={people} />
        );
      })}
    </div>
  );
}

export default PeopleList;
