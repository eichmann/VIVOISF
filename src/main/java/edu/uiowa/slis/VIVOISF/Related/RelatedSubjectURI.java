package edu.uiowa.slis.VIVOISF.Related;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelatedSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelatedSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RelatedSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Related theRelated = (Related)findAncestorWithClass(this, Related.class);
			if (!theRelated.commitNeeded) {
				pageContext.getOut().print(theRelated.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Related for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Related theRelated = (Related)findAncestorWithClass(this, Related.class);
			return theRelated.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Related for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Related theRelated = (Related)findAncestorWithClass(this, Related.class);
			theRelated.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Related for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for subjectURI tag ");
		}
	}
}

