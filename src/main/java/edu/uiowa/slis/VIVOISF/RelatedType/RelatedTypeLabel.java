package edu.uiowa.slis.VIVOISF.RelatedType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelatedTypeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelatedTypeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RelatedTypeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RelatedType theRelatedType = (RelatedType)findAncestorWithClass(this, RelatedType.class);
			if (!theRelatedType.commitNeeded) {
				pageContext.getOut().print(theRelatedType.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RelatedType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RelatedType for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			RelatedType theRelatedType = (RelatedType)findAncestorWithClass(this, RelatedType.class);
			return theRelatedType.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing RelatedType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RelatedType for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			RelatedType theRelatedType = (RelatedType)findAncestorWithClass(this, RelatedType.class);
			theRelatedType.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing RelatedType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RelatedType for label tag ");
		}
	}
}

