package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			if (!thegroup.commitNeeded) {
				pageContext.getOut().print(thegroup.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			return thegroup.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			thegroup.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for subjectURI tag ");
		}
	}
}

