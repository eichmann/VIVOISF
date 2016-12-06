package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasMaxLatitudeIterator theEditorship = (EditorshipHasMaxLatitudeIterator)findAncestorWithClass(this, EditorshipHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theEditorship.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

