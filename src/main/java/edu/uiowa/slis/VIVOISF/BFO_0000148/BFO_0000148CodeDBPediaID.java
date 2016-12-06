package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148CodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148CodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148CodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148CodeDBPediaIDIterator theBFO_0000148 = (BFO_0000148CodeDBPediaIDIterator)findAncestorWithClass(this, BFO_0000148CodeDBPediaIDIterator.class);
			pageContext.getOut().print(theBFO_0000148.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

