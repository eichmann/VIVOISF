package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			if (!theCollection.commitNeeded) {
				pageContext.getOut().print(theCollection.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			return theCollection.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Collection for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			theCollection.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hideFromDisplay tag ");
		}
	}
}

