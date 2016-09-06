package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			if (!theterritory.commitNeeded) {
				pageContext.getOut().print(theterritory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing territory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			return theterritory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing territory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			theterritory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing territory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for subjectURI tag ");
		}
	}
}

