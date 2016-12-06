package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(KindLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindLandAreaUnitIterator theKind = (KindLandAreaUnitIterator)findAncestorWithClass(this, KindLandAreaUnitIterator.class);
			pageContext.getOut().print(theKind.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

