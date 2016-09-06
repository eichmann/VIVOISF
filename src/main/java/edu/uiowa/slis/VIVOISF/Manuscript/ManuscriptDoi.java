package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptDoiIterator theManuscript = (ManuscriptDoiIterator)findAncestorWithClass(this, ManuscriptDoiIterator.class);
			pageContext.getOut().print(theManuscript.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for doi tag ");
		}
		return SKIP_BODY;
	}
}

