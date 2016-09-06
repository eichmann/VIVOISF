package edu.uiowa.slis.VIVOISF.OCRE100038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OCRE100038RO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OCRE100038RO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(OCRE100038RO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OCRE100038RO_0000057Iterator theOCRE100038RO_0000057Iterator = (OCRE100038RO_0000057Iterator)findAncestorWithClass(this, OCRE100038RO_0000057Iterator.class);
			pageContext.getOut().print(theOCRE100038RO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing OCRE100038 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OCRE100038 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

