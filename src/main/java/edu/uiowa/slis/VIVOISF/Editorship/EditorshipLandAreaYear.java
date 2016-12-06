package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipLandAreaYearIterator theEditorship = (EditorshipLandAreaYearIterator)findAncestorWithClass(this, EditorshipLandAreaYearIterator.class);
			pageContext.getOut().print(theEditorship.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

