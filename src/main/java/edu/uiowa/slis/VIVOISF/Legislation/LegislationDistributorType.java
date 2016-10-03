package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationDistributorIterator theLegislationDistributorIterator = (LegislationDistributorIterator)findAncestorWithClass(this, LegislationDistributorIterator.class);
			pageContext.getOut().print(theLegislationDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for distributor tag ");
		}
		return SKIP_BODY;
	}
}

