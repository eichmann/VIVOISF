package edu.uiowa.slis.VIVOISF.OCRE100038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OCRE100038BFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OCRE100038BFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OCRE100038BFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OCRE100038BFO_0000055Iterator theOCRE100038BFO_0000055Iterator = (OCRE100038BFO_0000055Iterator)findAncestorWithClass(this, OCRE100038BFO_0000055Iterator.class);
			pageContext.getOut().print(theOCRE100038BFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OCRE100038 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OCRE100038 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

