package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRO_0002234Iterator theIndividualRO_0002234Iterator = (IndividualRO_0002234Iterator)findAncestorWithClass(this, IndividualRO_0002234Iterator.class);
			pageContext.getOut().print(theIndividualRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

