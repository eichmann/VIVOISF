package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020CodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020CodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020CodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020CodeDBPediaIDIterator theBFO_0000020 = (BFO_0000020CodeDBPediaIDIterator)findAncestorWithClass(this, BFO_0000020CodeDBPediaIDIterator.class);
			pageContext.getOut().print(theBFO_0000020.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

