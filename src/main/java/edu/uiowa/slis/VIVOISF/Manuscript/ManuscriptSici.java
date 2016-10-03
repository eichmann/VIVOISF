package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptSiciIterator theManuscript = (ManuscriptSiciIterator)findAncestorWithClass(this, ManuscriptSiciIterator.class);
			pageContext.getOut().print(theManuscript.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for sici tag ");
		}
		return SKIP_BODY;
	}
}

