package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			if (!theeconomic_region.commitNeeded) {
				pageContext.getOut().print(theeconomic_region.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			return theeconomic_region.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing economic_region for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			theeconomic_region.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for abbreviation tag ");
		}
	}
}

