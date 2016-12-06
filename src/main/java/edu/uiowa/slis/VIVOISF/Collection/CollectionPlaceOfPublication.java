package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			if (!theCollection.commitNeeded) {
				pageContext.getOut().print(theCollection.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			return theCollection.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Collection for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			theCollection.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for placeOfPublication tag ");
		}
	}
}

