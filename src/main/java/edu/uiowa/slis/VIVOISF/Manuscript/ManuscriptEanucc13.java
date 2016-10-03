package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptEanucc13Iterator theManuscript = (ManuscriptEanucc13Iterator)findAncestorWithClass(this, ManuscriptEanucc13Iterator.class);
			pageContext.getOut().print(theManuscript.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

