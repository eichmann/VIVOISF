package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for outreachOverview tag ");
		}
	}
}

