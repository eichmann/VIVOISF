package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for teachingOverview tag ");
		}
	}
}

