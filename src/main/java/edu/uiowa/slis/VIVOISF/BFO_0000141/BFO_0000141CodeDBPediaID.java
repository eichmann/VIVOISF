package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141CodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141CodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141CodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141CodeDBPediaIDIterator theBFO_0000141 = (BFO_0000141CodeDBPediaIDIterator)findAncestorWithClass(this, BFO_0000141CodeDBPediaIDIterator.class);
			pageContext.getOut().print(theBFO_0000141.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

