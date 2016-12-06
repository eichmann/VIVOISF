package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRO_0002353Iterator theIndividualRO_0002353Iterator = (IndividualRO_0002353Iterator)findAncestorWithClass(this, IndividualRO_0002353Iterator.class);
			pageContext.getOut().print(theIndividualRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

