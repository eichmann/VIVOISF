package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeDBPediaIDIterator theself_governing = (self_governingCodeDBPediaIDIterator)findAncestorWithClass(this, self_governingCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theself_governing.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

