package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRO_0001025Iterator theIndividualRO_0001025Iterator = (IndividualRO_0001025Iterator)findAncestorWithClass(this, IndividualRO_0001025Iterator.class);
			pageContext.getOut().print(theIndividualRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

