package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipAgriculturalAreaYearIterator theEditorship = (EditorshipAgriculturalAreaYearIterator)findAncestorWithClass(this, EditorshipAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theEditorship.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

