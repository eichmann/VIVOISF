package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasMinLongitudeIterator theEditorship = (EditorshipHasMinLongitudeIterator)findAncestorWithClass(this, EditorshipHasMinLongitudeIterator.class);
			pageContext.getOut().print(theEditorship.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

