package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			if (!theeconomic_region.commitNeeded) {
				pageContext.getOut().print(theeconomic_region.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			return theeconomic_region.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing economic_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			theeconomic_region.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for label tag ");
		}
	}
}

