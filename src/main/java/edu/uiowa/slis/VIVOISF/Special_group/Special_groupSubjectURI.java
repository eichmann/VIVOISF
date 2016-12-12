package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Special_group theSpecial_group = (Special_group)findAncestorWithClass(this, Special_group.class);
			if (!theSpecial_group.commitNeeded) {
				pageContext.getOut().print(theSpecial_group.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Special_group theSpecial_group = (Special_group)findAncestorWithClass(this, Special_group.class);
			return theSpecial_group.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Special_group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Special_group theSpecial_group = (Special_group)findAncestorWithClass(this, Special_group.class);
			theSpecial_group.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for subjectURI tag ");
		}
	}
}

