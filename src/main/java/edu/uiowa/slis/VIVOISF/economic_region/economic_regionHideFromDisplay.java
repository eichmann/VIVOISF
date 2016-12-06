package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			if (!theeconomic_region.commitNeeded) {
				pageContext.getOut().print(theeconomic_region.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			return theeconomic_region.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing economic_region for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			theeconomic_region.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hideFromDisplay tag ");
		}
	}
}

