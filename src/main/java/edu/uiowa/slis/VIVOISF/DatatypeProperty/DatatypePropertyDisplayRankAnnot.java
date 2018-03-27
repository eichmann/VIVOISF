package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyDisplayRankAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyDisplayRankAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyDisplayRankAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyDisplayRankAnnotIterator theDatatypeProperty = (DatatypePropertyDisplayRankAnnotIterator)findAncestorWithClass(this, DatatypePropertyDisplayRankAnnotIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getDisplayRankAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for displayRankAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for displayRankAnnot tag ");
		}
		return SKIP_BODY;
	}
}

