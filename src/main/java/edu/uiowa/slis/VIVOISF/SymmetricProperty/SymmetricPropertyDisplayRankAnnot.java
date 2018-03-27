package edu.uiowa.slis.VIVOISF.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyDisplayRankAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SymmetricPropertyDisplayRankAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyDisplayRankAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyDisplayRankAnnotIterator theSymmetricProperty = (SymmetricPropertyDisplayRankAnnotIterator)findAncestorWithClass(this, SymmetricPropertyDisplayRankAnnotIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getDisplayRankAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for displayRankAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for displayRankAnnot tag ");
		}
		return SKIP_BODY;
	}
}

