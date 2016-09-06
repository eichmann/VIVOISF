package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			if (!thespecial_group.commitNeeded) {
				pageContext.getOut().print(thespecial_group.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			return thespecial_group.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing special_group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			thespecial_group.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for subjectURI tag ");
		}
	}
}

