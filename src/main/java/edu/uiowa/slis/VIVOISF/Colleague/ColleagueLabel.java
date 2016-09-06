package edu.uiowa.slis.VIVOISF.Colleague;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ColleagueLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ColleagueLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ColleagueLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Colleague theColleague = (Colleague)findAncestorWithClass(this, Colleague.class);
			if (!theColleague.commitNeeded) {
				pageContext.getOut().print(theColleague.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Colleague for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Colleague for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Colleague theColleague = (Colleague)findAncestorWithClass(this, Colleague.class);
			return theColleague.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Colleague for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Colleague for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Colleague theColleague = (Colleague)findAncestorWithClass(this, Colleague.class);
			theColleague.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Colleague for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Colleague for label tag ");
		}
	}
}

