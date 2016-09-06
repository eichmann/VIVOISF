package edu.uiowa.slis.VIVOISF.Related;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelatedLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelatedLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RelatedLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Related theRelated = (Related)findAncestorWithClass(this, Related.class);
			if (!theRelated.commitNeeded) {
				pageContext.getOut().print(theRelated.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Related for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Related theRelated = (Related)findAncestorWithClass(this, Related.class);
			return theRelated.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Related for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Related theRelated = (Related)findAncestorWithClass(this, Related.class);
			theRelated.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Related for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Related for label tag ");
		}
	}
}

