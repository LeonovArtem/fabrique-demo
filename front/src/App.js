import { Admin, Resource } from 'react-admin';
import restProvider from 'ra-data-simple-rest'
import SurveyList from './components/survey/SurveyList'
import SurveyEdit from './components/survey/SurveyEdit'
import SurveyCreate from './components/survey/SurveyCreate'
import SurveyShow from './components/survey/SurveyShow'
import QuestionList from './components/question/QuestionList'
import QuestionEdit from './components/question/QuestionEdit'
import QuestionCreate from './components/question/QuestionCreate'
import QuestionShow from './components/question/QuestionShow'
import SurveyIcon from "@material-ui/icons/Book";
import QuestionIcon from "@material-ui/icons/Star";

function App() {
  return (
      <Admin dataProvider={restProvider('http://localhost:9001/v1')}>
          <Resource name="survey"
                    list={SurveyList}
                    edit={SurveyEdit}
                    create={SurveyCreate}
                    show={SurveyShow}
                    icon={SurveyIcon}
          />

          <Resource name="question"
                    list={QuestionList}
                    edit={QuestionEdit}
                    create={QuestionCreate}
                    show={QuestionShow}
                    icon={QuestionIcon}
          />
      </Admin>
  );
}

export default App;
