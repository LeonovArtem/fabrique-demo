import {Show, SimpleShowLayout, TextField, DateField, RichTextField} from 'react-admin';

export const SurveyShow = (props) => (
    <Show {...props}>
        <SimpleShowLayout>
            <TextField source="id"/>
            <TextField label="Название" source="name"/>
            <RichTextField label="Описание" multiline source="description"/>
            <DateField label="Дата старта" source="startAt"/>
            <DateField label="Дата окончания" source="endAt"/>
        </SimpleShowLayout>
    </Show>
)

export default SurveyShow