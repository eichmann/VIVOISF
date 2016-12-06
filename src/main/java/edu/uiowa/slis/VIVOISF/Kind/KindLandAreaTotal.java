package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(KindLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindLandAreaTotalIterator theKind = (KindLandAreaTotalIterator)findAncestorWithClass(this, KindLandAreaTotalIterator.class);
			pageContext.getOut().print(theKind.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

