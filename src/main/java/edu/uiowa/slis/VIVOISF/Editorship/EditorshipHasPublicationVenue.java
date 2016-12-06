package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasPublicationVenueIterator theEditorshipHasPublicationVenueIterator = (EditorshipHasPublicationVenueIterator)findAncestorWithClass(this, EditorshipHasPublicationVenueIterator.class);
			pageContext.getOut().print(theEditorshipHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

