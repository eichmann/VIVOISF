package edu.uiowa.slis.VIVOISF.RelatedType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelatedTypeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelatedTypeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RelatedTypeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RelatedType theRelatedType = (RelatedType)findAncestorWithClass(this, RelatedType.class);
			if (!theRelatedType.commitNeeded) {
				pageContext.getOut().print(theRelatedType.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RelatedType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RelatedType for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			RelatedType theRelatedType = (RelatedType)findAncestorWithClass(this, RelatedType.class);
			return theRelatedType.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing RelatedType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RelatedType for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			RelatedType theRelatedType = (RelatedType)findAncestorWithClass(this, RelatedType.class);
			theRelatedType.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing RelatedType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RelatedType for subjectURI tag ");
		}
	}
}

