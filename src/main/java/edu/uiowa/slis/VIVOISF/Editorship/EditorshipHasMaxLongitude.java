package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasMaxLongitudeIterator theEditorship = (EditorshipHasMaxLongitudeIterator)findAncestorWithClass(this, EditorshipHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theEditorship.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

