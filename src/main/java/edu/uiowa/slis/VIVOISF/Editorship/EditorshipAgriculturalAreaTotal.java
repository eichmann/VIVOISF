package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipAgriculturalAreaTotalIterator theEditorship = (EditorshipAgriculturalAreaTotalIterator)findAncestorWithClass(this, EditorshipAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theEditorship.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

