package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualRO_0000056Iterator theIndividualRO_0000056Iterator = (IndividualRO_0000056Iterator)findAncestorWithClass(this, IndividualRO_0000056Iterator.class);
			pageContext.getOut().print(theIndividualRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

