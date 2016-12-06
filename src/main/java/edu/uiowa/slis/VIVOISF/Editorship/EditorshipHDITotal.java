package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHDITotalIterator theEditorship = (EditorshipHDITotalIterator)findAncestorWithClass(this, EditorshipHDITotalIterator.class);
			pageContext.getOut().print(theEditorship.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

