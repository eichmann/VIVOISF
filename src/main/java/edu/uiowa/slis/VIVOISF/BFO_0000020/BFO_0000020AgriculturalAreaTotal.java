package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020AgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020AgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020AgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020AgriculturalAreaTotalIterator theBFO_0000020 = (BFO_0000020AgriculturalAreaTotalIterator)findAncestorWithClass(this, BFO_0000020AgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theBFO_0000020.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

