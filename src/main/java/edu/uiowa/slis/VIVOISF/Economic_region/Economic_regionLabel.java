package edu.uiowa.slis.VIVOISF.Economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Economic_regionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Economic_regionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Economic_regionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Economic_region theEconomic_region = (Economic_region)findAncestorWithClass(this, Economic_region.class);
			if (!theEconomic_region.commitNeeded) {
				pageContext.getOut().print(theEconomic_region.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Economic_region theEconomic_region = (Economic_region)findAncestorWithClass(this, Economic_region.class);
			return theEconomic_region.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Economic_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Economic_region theEconomic_region = (Economic_region)findAncestorWithClass(this, Economic_region.class);
			theEconomic_region.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Economic_region for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Economic_region for label tag ");
		}
	}
}

