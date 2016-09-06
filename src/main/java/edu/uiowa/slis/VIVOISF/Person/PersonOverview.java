package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for overview tag ");
		}
	}
}

