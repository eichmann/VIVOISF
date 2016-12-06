package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipPublicationVenueForIterator theEditorshipPublicationVenueForIterator = (EditorshipPublicationVenueForIterator)findAncestorWithClass(this, EditorshipPublicationVenueForIterator.class);
			pageContext.getOut().print(theEditorshipPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

