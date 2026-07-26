import styles from './CohortDetails.module.css';

function CohortDetails(props) {
    const { cohortCode, technology, startDate, currentStatus, coachName, trainerName } = props.cohort;

    return (
        <div className={styles.box}>
            <h3 style={{ color: currentStatus === 'Ongoing' ? 'green' : 'blue' }}>
                {cohortCode} - <span>{technology}</span>
            </h3>
            <dl>
                <dt>Started On</dt>
                <dd>{startDate}</dd>
                <dt>Current Status</dt>
                <dd>{currentStatus}</dd>
                <dt>Coach</dt>
                <dd>{coachName}</dd>
                <dt>Trainer</dt>
                <dd>{trainerName}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;