package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015NameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015NameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015NameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015NameListITIterator theBFO_0000015 = (BFO_0000015NameListITIterator)findAncestorWithClass(this, BFO_0000015NameListITIterator.class);
			pageContext.getOut().print(theBFO_0000015.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

