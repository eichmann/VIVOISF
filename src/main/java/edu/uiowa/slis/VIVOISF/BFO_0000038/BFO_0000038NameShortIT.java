package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038NameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038NameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038NameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038NameShortITIterator theBFO_0000038 = (BFO_0000038NameShortITIterator)findAncestorWithClass(this, BFO_0000038NameShortITIterator.class);
			pageContext.getOut().print(theBFO_0000038.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

