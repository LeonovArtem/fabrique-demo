import {Show, SimpleShowLayout, TextField, RichTextField} from 'react-admin';

export const QuestionShow = (props) => (
    <Show {...props}>
        <SimpleShowLayout>
            <TextField source="id"/>
            <RichTextField label="Текст вопроса" source="text"/>
            <TextField label="Тип" source="type"/>
        </SimpleShowLayout>
    </Show>
)

export default QuestionShow