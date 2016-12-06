package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(KindGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindGDPUnitIterator theKind = (KindGDPUnitIterator)findAncestorWithClass(this, KindGDPUnitIterator.class);
			pageContext.getOut().print(theKind.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

