package edu.uiowa.slis.VIVOISF.OCRE100038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OCRE100038ERO_0001518Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OCRE100038ERO_0001518Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OCRE100038ERO_0001518Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OCRE100038ERO_0001518InverseIterator theOCRE100038ERO_0001518InverseIterator = (OCRE100038ERO_0001518InverseIterator)findAncestorWithClass(this, OCRE100038ERO_0001518InverseIterator.class);
			pageContext.getOut().print(theOCRE100038ERO_0001518InverseIterator.getERO_0001518Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OCRE100038 for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OCRE100038 for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

